package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_333 {
    private final Production87_333 production = new Production87_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}