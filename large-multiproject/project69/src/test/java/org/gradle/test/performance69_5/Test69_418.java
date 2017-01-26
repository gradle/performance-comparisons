package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_418 {
    private final Production69_418 production = new Production69_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}