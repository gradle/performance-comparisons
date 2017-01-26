package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_477 {
    private final Production14_477 production = new Production14_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}