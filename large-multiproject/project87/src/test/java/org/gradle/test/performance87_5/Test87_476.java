package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_476 {
    private final Production87_476 production = new Production87_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}