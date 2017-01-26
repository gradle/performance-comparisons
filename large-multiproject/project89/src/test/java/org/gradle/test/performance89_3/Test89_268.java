package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_268 {
    private final Production89_268 production = new Production89_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}