package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_243 {
    private final Production4_243 production = new Production4_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}