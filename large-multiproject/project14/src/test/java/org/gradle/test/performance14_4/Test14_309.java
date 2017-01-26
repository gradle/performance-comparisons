package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_309 {
    private final Production14_309 production = new Production14_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}