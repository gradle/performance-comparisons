package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_244 {
    private final Production14_244 production = new Production14_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}