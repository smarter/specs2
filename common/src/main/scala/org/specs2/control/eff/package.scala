package org.specs2.control

package object eff {

  type <=[M[_], R] = Member.<=[M, R]
  type |=[M[_], R] = MemberIn.|=[M, R]

  object eff         extends EffCreation          with EffInterpretation
  object writer      extends WriterCreation       with WriterInterpretation
  object eval        extends EvalEffect
  object disjunction extends DisjunctionCreation  with DisjunctionInterpretation
  object future      extends FutureCreation       with FutureInterpretation
  object safe        extends SafeCreation         with SafeInterpretation
  object async       extends AsyncCreation        with AsyncInterpretation

  object create extends
    WriterCreation with
    EvalCreation with
    DisjunctionCreation with
    FutureCreation with
    SafeCreation with
    AsyncCreation with
    EffCreation

  object all extends
    WriterEffect with
    EvalEffect with
    DisjunctionEffect with
    FutureEffect with
    SafeEffect with
    AsyncEffect with
    EffInterpretation with
    EffCreation with
    EffImplicits

  object interpret extends
    Interpret

}