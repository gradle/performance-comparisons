package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_152 {
    private final Production14_152 production = new Production14_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}