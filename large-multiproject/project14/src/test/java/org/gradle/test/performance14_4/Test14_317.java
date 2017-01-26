package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_317 {
    private final Production14_317 production = new Production14_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}