package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_4 {
    private final Production69_4 production = new Production69_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}