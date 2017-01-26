package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_360 {
    private final Production99_360 production = new Production99_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}