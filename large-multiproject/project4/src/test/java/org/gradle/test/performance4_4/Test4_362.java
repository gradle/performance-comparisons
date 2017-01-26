package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_362 {
    private final Production4_362 production = new Production4_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}