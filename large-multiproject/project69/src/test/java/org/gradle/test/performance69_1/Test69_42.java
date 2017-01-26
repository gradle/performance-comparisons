package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_42 {
    private final Production69_42 production = new Production69_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}