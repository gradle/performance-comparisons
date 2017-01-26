package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_307 {
    private final Production14_307 production = new Production14_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}