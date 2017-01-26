package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_224 {
    private final Production59_224 production = new Production59_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}