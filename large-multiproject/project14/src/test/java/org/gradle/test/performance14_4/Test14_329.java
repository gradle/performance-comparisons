package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_329 {
    private final Production14_329 production = new Production14_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}