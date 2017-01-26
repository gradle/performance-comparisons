package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27169 {
    private final Productionnull_27169 production = new Productionnull_27169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}