package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_428 {
    private final Production59_428 production = new Production59_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}