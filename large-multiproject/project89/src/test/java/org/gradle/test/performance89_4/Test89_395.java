package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_395 {
    private final Production89_395 production = new Production89_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}