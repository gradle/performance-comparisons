package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_35 {
    private final Production14_35 production = new Production14_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}