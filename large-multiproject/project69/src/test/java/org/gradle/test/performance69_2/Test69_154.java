package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_154 {
    private final Production69_154 production = new Production69_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}