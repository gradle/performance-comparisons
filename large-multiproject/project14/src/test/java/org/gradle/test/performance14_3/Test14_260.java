package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_260 {
    private final Production14_260 production = new Production14_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}