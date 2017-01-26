package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_228 {
    private final Production89_228 production = new Production89_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}