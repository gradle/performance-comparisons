package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_360 {
    private final Production20_360 production = new Production20_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}