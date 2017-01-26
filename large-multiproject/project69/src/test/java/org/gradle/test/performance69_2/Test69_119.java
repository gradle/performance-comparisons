package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_119 {
    private final Production69_119 production = new Production69_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}