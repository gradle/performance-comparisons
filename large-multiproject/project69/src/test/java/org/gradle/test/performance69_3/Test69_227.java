package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_227 {
    private final Production69_227 production = new Production69_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}