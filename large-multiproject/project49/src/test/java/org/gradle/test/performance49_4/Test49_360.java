package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_360 {
    private final Production49_360 production = new Production49_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}