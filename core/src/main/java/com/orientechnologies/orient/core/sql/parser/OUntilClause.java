/* Generated By:JJTree: Do not edit this line. OUntilClause.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

public class OUntilClause extends OWhereClause {
  OBooleanExpression baseExpression;

  public OUntilClause(int id) {
    super(id);
  }

  public OUntilClause(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public boolean matchesFilters(OIdentifiable currentRecord) {
    if (baseExpression == null) {
      return true;
    }
    return baseExpression.evaluate(currentRecord);
  }

  @Override
  public String toString() {
    if (baseExpression == null) {
      return "";
    }
    return baseExpression.toString();
  }

  public void replaceParameters(Map<Object, Object> params) {
    if(baseExpression!=null) {
      baseExpression.replaceParameters(params);
    }

  }
}
/* JavaCC - OriginalChecksum=09c88939dd1086f32c1fcade03a4bb73 (do not edit this line) */