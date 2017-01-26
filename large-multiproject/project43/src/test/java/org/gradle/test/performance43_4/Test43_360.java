package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_360 {
    private final Production43_360 production = new Production43_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}