package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_42 {
    private final Production14_42 production = new Production14_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}