package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_213 {
    private final Production89_213 production = new Production89_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}