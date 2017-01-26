package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_121 {
    private final Production73_121 production = new Production73_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}