package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_134 {
    private final Production14_134 production = new Production14_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}