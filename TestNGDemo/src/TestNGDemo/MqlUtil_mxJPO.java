package TestNGDemo;



package TestNGDemo;

import matrix.db.Context;
import matrix.db.MQLCommand;
import matrix.util.MatrixException;

/**
* The JPO class holds utilities for easy MQL access.
*
* @author The MxUpdate Team
*/
public final class MqlUtil_mxJPO
{
   /**
    * Dummy constructor so that the MQL utility class could not be
    * instanciated.
    */
   private MqlUtil_mxJPO()
   {
   }

   /**
    * Executes given MQL command and returns the trimmed result of the MQL
    * execution.
    *
    * @param _paramCache   parameter cache
    * @param _cmd          MQL command to execute
    * @return trimmed result of the MQL execution
    * @throws MatrixException if MQL execution failed
    */
   public static String execMql(final ParameterCache_mxJPO _paramCache,
                                final CharSequence _cmd)
           throws MatrixException
   {
       return MqlUtil_mxJPO.execMql(_paramCache.getContext(), _cmd, true);
   }

   /**
    * Executes given MQL command and returns the trimmed result of the MQL
    * execution.
    *
    * @param _context              MX context for this request
    * @param _cmd                  MQL command to execute
    * @param _includeMQLCommand    must be MQL command included in the
    *                              exception?
    * @return trimmed result of the MQL execution
    * @throws MatrixException if MQL execution failed; includes the MQL
    *                         command if <code>_includeMQLCommand</code> is
    *                         set to <i>true</i>
    */
   public static String execMql(final Context _context,
                                final CharSequence _cmd,
                                final boolean _includeMQLCommand)
           throws MatrixException
   {
       final MQLCommand mql = new MQLCommand();
       mql.executeCommand(_context, _cmd.toString());
       if ((mql.getError() != null) && !"".equals(mql.getError()))  {
           throw new MatrixException(mql.getError()
                   + (_includeMQLCommand ? ("\nMQL command was:\n" + _cmd) : ""));
       }
       return mql.getResult().trim();
   }

   /**
    * Sets the history on.
    *
    * @param _paramCache       parameter cache
    * @throws MatrixException if the history could not be set to on
    */
   public static void setHistoryOn(final ParameterCache_mxJPO _paramCache)
           throws MatrixException
   {
       MqlUtil_mxJPO.execMql(_paramCache, "history on");
   }

   /**
    * Sets the history off.
    *
    * @param _paramCache       parameter cache
    * @throws MatrixException if the history could not be set to off
    */
   public static void setHistoryOff(final ParameterCache_mxJPO _paramCache)
           throws MatrixException
   {
       MqlUtil_mxJPO.execMql(_paramCache, "history off");
   }
}