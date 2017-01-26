package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_360 {
    private final Production15_360 production = new Production15_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}