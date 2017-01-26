package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_164 {
    private final Production14_164 production = new Production14_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}