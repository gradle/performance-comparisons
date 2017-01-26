package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21449 {
    private final Productionnull_21449 production = new Productionnull_21449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}