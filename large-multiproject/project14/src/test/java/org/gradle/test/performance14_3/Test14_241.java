package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_241 {
    private final Production14_241 production = new Production14_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}