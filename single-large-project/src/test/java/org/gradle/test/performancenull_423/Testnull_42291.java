package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42291 {
    private final Productionnull_42291 production = new Productionnull_42291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}