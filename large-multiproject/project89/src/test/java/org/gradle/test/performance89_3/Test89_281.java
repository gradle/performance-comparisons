package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_281 {
    private final Production89_281 production = new Production89_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}