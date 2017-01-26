package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_360 {
    private final Production89_360 production = new Production89_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}