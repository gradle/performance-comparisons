package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_210 {
    private final Production14_210 production = new Production14_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}