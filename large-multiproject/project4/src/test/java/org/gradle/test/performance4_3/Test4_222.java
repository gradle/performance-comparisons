package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_222 {
    private final Production4_222 production = new Production4_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}