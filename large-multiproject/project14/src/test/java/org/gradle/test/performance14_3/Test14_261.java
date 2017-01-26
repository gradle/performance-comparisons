package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_261 {
    private final Production14_261 production = new Production14_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}