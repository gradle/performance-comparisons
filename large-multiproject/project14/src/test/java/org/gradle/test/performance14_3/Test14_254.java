package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_254 {
    private final Production14_254 production = new Production14_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}