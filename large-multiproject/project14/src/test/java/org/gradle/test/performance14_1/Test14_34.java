package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_34 {
    private final Production14_34 production = new Production14_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}