package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_360 {
    private final Production93_360 production = new Production93_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}