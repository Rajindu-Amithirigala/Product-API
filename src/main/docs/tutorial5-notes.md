# Tutorial 5 notes

## Activity 0: predict the output
(paste your table with the answers)

## Activity 1
The new JSON field is `summary`. Jackson builds JSON from getters, and
getSummary() looks like a getter, so it was called automatically. The
digital product's value came from DigitalProduct.getSummary() and the
monitor's came from Product.getSummary().

@Override protects me from: a typo in the method name. With the
annotation the compiler reports an error. Without it the misspelled
method just becomes a new method and the bug is silent.

## Activity 2
The summary works without @Override, but I should still always write it
because the compiler can then catch a typo or a wrong signature
instead of the method silently becoming a new one.

## Activity 3
Error when I removed PhysicalProduct's override: "PhysicalProduct is not
abstract and does not override abstract method getSummary() in Product".
An abstract method is safer than a generic default because every
subclass is forced to write its own answer instead of silently
inheriting one that doesn't fit.

## Activity 4
Both classes compile even though their applyDiscount() bodies differ
because the interface fixes the signature, not the body. Each class
decides how to honour the contract.

## Activity 5
Error for p.applyDiscount(0.10): (paste the exact message you saw).
It fails because the compiler only checks the declared type, Product,
which doesn't have applyDiscount(), even though every object in the
list really is Discountable.

If I added a third subclass next week I'd change zero lines of
getAllSummaries(), because the loop only calls getSummary() on a
Product and runtime dispatch picks the right version.

