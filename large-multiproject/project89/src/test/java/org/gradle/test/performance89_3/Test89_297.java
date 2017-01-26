package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_297 {
    private final Production89_297 production = new Production89_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}