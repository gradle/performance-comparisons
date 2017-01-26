package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40719 {
    private final Productionnull_40719 production = new Productionnull_40719("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}