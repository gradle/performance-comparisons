package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_47 {
    private final Production14_47 production = new Production14_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}