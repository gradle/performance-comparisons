package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_13 {
    private final Production73_13 production = new Production73_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}