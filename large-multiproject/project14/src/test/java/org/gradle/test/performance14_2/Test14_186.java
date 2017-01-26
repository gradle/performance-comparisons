package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_186 {
    private final Production14_186 production = new Production14_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}