package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_118 {
    private final Production73_118 production = new Production73_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}