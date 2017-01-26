package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_334 {
    private final Production14_334 production = new Production14_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}