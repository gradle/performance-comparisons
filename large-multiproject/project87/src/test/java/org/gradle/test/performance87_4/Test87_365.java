package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_365 {
    private final Production87_365 production = new Production87_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}