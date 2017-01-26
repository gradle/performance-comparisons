package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_196 {
    private final Production4_196 production = new Production4_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}