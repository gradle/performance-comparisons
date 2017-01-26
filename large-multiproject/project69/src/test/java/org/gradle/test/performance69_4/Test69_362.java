package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_362 {
    private final Production69_362 production = new Production69_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}