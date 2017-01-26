package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_31 {
    private final Production14_31 production = new Production14_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}