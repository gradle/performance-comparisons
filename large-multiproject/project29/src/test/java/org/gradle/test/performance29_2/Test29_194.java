package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_194 {
    private final Production29_194 production = new Production29_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}