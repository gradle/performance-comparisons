package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_284 {
    private final Production59_284 production = new Production59_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}