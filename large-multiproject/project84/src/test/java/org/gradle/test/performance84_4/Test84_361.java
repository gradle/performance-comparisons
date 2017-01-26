package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_361 {
    private final Production84_361 production = new Production84_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}