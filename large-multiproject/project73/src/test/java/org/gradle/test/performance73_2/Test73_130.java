package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_130 {
    private final Production73_130 production = new Production73_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}