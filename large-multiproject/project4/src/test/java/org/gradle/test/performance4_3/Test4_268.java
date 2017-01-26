package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_268 {
    private final Production4_268 production = new Production4_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}