package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_360 {
    private final Production58_360 production = new Production58_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}