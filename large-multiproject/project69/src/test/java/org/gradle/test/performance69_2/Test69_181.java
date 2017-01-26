package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_181 {
    private final Production69_181 production = new Production69_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}