package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_252 {
    private final Production69_252 production = new Production69_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}