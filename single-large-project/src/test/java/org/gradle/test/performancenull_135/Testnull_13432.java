package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13432 {
    private final Productionnull_13432 production = new Productionnull_13432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}