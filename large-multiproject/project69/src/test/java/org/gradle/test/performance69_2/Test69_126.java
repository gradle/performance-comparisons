package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_126 {
    private final Production69_126 production = new Production69_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}