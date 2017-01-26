package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_398 {
    private final Production89_398 production = new Production89_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}