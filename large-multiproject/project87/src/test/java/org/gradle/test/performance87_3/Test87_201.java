package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_201 {
    private final Production87_201 production = new Production87_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}