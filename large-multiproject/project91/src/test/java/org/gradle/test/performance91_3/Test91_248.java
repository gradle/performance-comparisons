package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_248 {
    private final Production91_248 production = new Production91_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}