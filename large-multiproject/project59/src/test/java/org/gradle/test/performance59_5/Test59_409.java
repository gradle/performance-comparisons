package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_409 {
    private final Production59_409 production = new Production59_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}