package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_401 {
    private final Production89_401 production = new Production89_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}