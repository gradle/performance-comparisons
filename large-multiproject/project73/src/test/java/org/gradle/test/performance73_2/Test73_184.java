package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_184 {
    private final Production73_184 production = new Production73_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}