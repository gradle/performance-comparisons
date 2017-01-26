package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_260 {
    private final Production4_260 production = new Production4_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}