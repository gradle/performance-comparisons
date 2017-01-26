package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_28 {
    private final Production14_28 production = new Production14_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}