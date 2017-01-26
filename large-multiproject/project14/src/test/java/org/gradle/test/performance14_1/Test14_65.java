package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_65 {
    private final Production14_65 production = new Production14_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}