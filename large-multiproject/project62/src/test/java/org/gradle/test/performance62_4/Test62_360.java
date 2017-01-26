package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_360 {
    private final Production62_360 production = new Production62_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}