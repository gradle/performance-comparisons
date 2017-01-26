package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_26 {
    private final Production14_26 production = new Production14_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}