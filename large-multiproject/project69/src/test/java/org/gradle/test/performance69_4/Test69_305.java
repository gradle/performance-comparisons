package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_305 {
    private final Production69_305 production = new Production69_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}