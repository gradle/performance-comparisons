package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_90 {
    private final Production89_90 production = new Production89_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}