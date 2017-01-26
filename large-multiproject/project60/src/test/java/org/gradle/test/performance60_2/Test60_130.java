package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_130 {
    private final Production60_130 production = new Production60_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}