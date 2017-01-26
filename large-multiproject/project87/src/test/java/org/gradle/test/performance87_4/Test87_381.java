package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_381 {
    private final Production87_381 production = new Production87_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}