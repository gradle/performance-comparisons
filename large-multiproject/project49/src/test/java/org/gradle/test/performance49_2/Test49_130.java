package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_130 {
    private final Production49_130 production = new Production49_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}