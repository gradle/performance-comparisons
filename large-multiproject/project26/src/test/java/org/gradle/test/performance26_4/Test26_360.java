package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_360 {
    private final Production26_360 production = new Production26_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}