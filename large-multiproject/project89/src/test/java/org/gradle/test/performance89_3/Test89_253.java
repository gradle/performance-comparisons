package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_253 {
    private final Production89_253 production = new Production89_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}