package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_258 {
    private final Production14_258 production = new Production14_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}