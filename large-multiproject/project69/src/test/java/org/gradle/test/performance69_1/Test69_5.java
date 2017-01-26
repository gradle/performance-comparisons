package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_5 {
    private final Production69_5 production = new Production69_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}