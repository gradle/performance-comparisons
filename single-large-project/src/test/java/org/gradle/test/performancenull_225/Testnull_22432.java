package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22432 {
    private final Productionnull_22432 production = new Productionnull_22432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}