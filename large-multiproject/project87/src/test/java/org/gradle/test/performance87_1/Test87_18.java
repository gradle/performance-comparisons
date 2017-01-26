package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_18 {
    private final Production87_18 production = new Production87_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}