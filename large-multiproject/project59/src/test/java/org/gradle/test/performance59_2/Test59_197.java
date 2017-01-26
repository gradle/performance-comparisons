package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_197 {
    private final Production59_197 production = new Production59_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}