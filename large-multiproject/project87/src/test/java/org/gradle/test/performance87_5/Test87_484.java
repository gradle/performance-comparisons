package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_484 {
    private final Production87_484 production = new Production87_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}