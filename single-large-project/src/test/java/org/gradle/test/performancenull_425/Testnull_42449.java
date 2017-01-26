package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42449 {
    private final Productionnull_42449 production = new Productionnull_42449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}