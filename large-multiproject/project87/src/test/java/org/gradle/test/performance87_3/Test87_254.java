package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_254 {
    private final Production87_254 production = new Production87_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}