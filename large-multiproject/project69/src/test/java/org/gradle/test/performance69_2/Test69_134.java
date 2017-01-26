package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_134 {
    private final Production69_134 production = new Production69_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}