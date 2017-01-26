package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_481 {
    private final Production14_481 production = new Production14_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}