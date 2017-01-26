package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_305 {
    private final Production89_305 production = new Production89_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}