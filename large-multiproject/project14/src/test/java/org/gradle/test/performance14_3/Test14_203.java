package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_203 {
    private final Production14_203 production = new Production14_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}