package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_360 {
    private final Production16_360 production = new Production16_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}