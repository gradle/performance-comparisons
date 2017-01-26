package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_382 {
    private final Production69_382 production = new Production69_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}