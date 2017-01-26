package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_222 {
    private final Production89_222 production = new Production89_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}