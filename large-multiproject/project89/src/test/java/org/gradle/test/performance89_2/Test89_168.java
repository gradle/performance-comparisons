package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_168 {
    private final Production89_168 production = new Production89_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}