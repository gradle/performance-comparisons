package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_145 {
    private final Production14_145 production = new Production14_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}