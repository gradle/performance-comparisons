package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_322 {
    private final Production14_322 production = new Production14_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}