package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_351 {
    private final Production63_351 production = new Production63_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}