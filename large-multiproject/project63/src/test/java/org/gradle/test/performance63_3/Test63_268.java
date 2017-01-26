package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_268 {
    private final Production63_268 production = new Production63_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}