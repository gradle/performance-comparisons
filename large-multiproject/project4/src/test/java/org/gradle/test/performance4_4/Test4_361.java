package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_361 {
    private final Production4_361 production = new Production4_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}