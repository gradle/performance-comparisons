package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_2 {
    private final Production69_2 production = new Production69_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}