package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_184 {
    private final Production59_184 production = new Production59_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}