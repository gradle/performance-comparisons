package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_196 {
    private final Production69_196 production = new Production69_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}