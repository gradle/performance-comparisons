package org.gradle.test.performancenull_269;

import static org.junit.Assert.*;

public class Testnull_26869 {
    private final Productionnull_26869 production = new Productionnull_26869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}