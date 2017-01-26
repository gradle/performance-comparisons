package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_321 {
    private final Production14_321 production = new Production14_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}