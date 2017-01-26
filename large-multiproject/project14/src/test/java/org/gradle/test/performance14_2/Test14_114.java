package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_114 {
    private final Production14_114 production = new Production14_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}