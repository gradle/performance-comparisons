package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_79 {
    private final Production59_79 production = new Production59_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}