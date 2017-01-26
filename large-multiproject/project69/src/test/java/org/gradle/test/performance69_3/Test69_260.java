package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_260 {
    private final Production69_260 production = new Production69_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}