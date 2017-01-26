package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_242 {
    private final Production87_242 production = new Production87_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}