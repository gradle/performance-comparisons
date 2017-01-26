package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_224 {
    private final Production87_224 production = new Production87_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}