package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_246 {
    private final Production89_246 production = new Production89_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}