package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_244 {
    private final Production69_244 production = new Production69_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}