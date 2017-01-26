package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25885 {
    private final Productionnull_25885 production = new Productionnull_25885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}