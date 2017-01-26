package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_268 {
    private final Production7_268 production = new Production7_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}