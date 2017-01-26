package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_462 {
    private final Production14_462 production = new Production14_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}