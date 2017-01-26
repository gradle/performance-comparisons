package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_39 {
    private final Production14_39 production = new Production14_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}