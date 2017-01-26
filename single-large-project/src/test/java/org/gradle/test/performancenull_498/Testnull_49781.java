package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49781 {
    private final Productionnull_49781 production = new Productionnull_49781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}