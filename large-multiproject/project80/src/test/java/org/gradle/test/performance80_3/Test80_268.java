package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_268 {
    private final Production80_268 production = new Production80_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}