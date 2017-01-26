package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_435 {
    private final Production14_435 production = new Production14_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}