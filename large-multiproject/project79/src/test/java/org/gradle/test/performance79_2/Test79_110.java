package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_110 {
    private final Production79_110 production = new Production79_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}