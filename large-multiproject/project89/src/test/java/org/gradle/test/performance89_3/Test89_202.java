package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_202 {
    private final Production89_202 production = new Production89_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}