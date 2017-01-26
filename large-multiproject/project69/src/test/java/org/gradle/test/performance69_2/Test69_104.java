package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_104 {
    private final Production69_104 production = new Production69_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}