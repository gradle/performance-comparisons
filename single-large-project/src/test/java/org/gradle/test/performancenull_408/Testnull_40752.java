package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40752 {
    private final Productionnull_40752 production = new Productionnull_40752("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}