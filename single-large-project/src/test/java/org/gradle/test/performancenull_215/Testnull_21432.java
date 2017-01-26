package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21432 {
    private final Productionnull_21432 production = new Productionnull_21432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}