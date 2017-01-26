package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_139 {
    private final Production69_139 production = new Production69_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}