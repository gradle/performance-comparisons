package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_162 {
    private final Production14_162 production = new Production14_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}