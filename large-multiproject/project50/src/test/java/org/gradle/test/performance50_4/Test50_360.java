package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_360 {
    private final Production50_360 production = new Production50_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}