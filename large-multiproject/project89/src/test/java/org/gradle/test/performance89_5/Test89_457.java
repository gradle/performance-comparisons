package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_457 {
    private final Production89_457 production = new Production89_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}