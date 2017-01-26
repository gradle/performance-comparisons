package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_70 {
    private final Production87_70 production = new Production87_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}