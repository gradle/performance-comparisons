package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_59 {
    private final Production14_59 production = new Production14_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}