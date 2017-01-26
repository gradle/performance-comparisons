package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_462 {
    private final Production87_462 production = new Production87_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}