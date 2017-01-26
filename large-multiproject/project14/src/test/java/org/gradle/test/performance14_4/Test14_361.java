package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_361 {
    private final Production14_361 production = new Production14_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}