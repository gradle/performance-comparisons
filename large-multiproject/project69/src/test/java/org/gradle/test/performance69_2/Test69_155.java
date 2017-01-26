package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_155 {
    private final Production69_155 production = new Production69_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}