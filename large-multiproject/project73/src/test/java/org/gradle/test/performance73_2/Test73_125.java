package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_125 {
    private final Production73_125 production = new Production73_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}