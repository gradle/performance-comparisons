package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_286 {
    private final Production14_286 production = new Production14_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}