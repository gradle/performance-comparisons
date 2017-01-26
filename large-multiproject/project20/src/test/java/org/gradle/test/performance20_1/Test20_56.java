package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_56 {
    private final Production20_56 production = new Production20_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}