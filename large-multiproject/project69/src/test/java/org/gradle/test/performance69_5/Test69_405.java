package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_405 {
    private final Production69_405 production = new Production69_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}