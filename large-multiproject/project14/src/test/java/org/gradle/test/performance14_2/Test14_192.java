package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_192 {
    private final Production14_192 production = new Production14_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}