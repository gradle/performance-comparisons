package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_53 {
    private final Production14_53 production = new Production14_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}