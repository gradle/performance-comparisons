package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_495 {
    private final Production14_495 production = new Production14_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}