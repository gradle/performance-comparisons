package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_287 {
    private final Production87_287 production = new Production87_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}