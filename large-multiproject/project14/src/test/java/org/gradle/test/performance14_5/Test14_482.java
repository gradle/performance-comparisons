package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_482 {
    private final Production14_482 production = new Production14_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}