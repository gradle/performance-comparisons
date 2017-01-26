package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_491 {
    private final Production87_491 production = new Production87_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}