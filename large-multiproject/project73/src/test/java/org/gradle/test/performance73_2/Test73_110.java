package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_110 {
    private final Production73_110 production = new Production73_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}