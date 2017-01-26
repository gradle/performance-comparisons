package org.gradle.test.performance69_4;

import static org.junit.Assert.*;

public class Test69_386 {
    private final Production69_386 production = new Production69_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}