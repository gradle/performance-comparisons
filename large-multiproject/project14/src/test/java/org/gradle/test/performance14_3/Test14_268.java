package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_268 {
    private final Production14_268 production = new Production14_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}