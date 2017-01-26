package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_239 {
    private final Production87_239 production = new Production87_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}