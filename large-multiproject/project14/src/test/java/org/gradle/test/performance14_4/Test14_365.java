package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_365 {
    private final Production14_365 production = new Production14_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}