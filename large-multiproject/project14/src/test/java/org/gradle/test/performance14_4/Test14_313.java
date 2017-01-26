package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_313 {
    private final Production14_313 production = new Production14_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}