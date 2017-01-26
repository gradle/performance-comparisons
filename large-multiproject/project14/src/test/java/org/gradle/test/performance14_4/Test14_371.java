package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_371 {
    private final Production14_371 production = new Production14_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}