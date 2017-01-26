package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_191 {
    private final Production4_191 production = new Production4_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}