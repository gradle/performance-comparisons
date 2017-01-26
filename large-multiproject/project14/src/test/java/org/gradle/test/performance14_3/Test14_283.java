package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_283 {
    private final Production14_283 production = new Production14_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}