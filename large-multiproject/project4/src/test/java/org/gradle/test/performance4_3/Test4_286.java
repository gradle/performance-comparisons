package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_286 {
    private final Production4_286 production = new Production4_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}