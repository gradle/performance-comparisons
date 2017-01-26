package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_92 {
    private final Production69_92 production = new Production69_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}