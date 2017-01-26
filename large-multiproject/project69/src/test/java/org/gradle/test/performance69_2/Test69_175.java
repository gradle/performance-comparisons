package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_175 {
    private final Production69_175 production = new Production69_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}