package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_379 {
    private final Production87_379 production = new Production87_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}