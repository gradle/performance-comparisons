package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_33 {
    private final Production14_33 production = new Production14_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}