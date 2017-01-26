package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_268 {
    private final Production58_268 production = new Production58_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}