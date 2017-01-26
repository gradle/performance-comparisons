package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_382 {
    private final Production14_382 production = new Production14_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}