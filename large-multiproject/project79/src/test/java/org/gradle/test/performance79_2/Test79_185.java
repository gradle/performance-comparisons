package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_185 {
    private final Production79_185 production = new Production79_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}