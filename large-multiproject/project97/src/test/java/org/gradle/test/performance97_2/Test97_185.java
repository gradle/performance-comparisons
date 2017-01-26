package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_185 {
    private final Production97_185 production = new Production97_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}