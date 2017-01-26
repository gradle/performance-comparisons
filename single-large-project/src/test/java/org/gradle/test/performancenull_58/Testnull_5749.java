package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5749 {
    private final Productionnull_5749 production = new Productionnull_5749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}