package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_106 {
    private final Production69_106 production = new Production69_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}