package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_297 {
    private final Production4_297 production = new Production4_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}