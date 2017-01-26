package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_248 {
    private final Production59_248 production = new Production59_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}