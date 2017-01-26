package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25270 {
    private final Productionnull_25270 production = new Productionnull_25270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}