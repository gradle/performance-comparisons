package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21053 {
    private final Productionnull_21053 production = new Productionnull_21053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}