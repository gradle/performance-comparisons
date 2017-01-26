package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_197 {
    private final Production73_197 production = new Production73_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}