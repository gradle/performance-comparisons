package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_191 {
    private final Production89_191 production = new Production89_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}