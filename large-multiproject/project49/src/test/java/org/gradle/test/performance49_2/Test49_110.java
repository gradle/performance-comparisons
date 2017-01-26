package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_110 {
    private final Production49_110 production = new Production49_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}