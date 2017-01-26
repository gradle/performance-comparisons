package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_168 {
    private final Production69_168 production = new Production69_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}