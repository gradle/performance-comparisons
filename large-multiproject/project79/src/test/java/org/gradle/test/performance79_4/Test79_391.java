package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_391 {
    private final Production79_391 production = new Production79_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}