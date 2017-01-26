package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_330 {
    private final Production14_330 production = new Production14_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}