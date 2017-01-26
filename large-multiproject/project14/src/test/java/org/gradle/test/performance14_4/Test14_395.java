package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_395 {
    private final Production14_395 production = new Production14_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}