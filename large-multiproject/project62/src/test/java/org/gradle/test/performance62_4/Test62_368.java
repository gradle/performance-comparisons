package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_368 {
    private final Production62_368 production = new Production62_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}