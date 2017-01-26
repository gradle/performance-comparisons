package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_249 {
    private final Production14_249 production = new Production14_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}