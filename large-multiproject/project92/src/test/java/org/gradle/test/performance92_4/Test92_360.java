package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_360 {
    private final Production92_360 production = new Production92_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}