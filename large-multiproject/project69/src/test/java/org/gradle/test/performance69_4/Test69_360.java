package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_360 {
    private final Production69_360 production = new Production69_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}