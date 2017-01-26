package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_332 {
    private final Production59_332 production = new Production59_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}