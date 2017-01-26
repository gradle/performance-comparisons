package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_343 {
    private final Production14_343 production = new Production14_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}