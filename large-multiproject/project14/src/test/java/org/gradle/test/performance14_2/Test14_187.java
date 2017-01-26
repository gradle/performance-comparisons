package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_187 {
    private final Production14_187 production = new Production14_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}