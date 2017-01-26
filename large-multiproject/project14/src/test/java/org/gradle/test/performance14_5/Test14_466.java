package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_466 {
    private final Production14_466 production = new Production14_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}