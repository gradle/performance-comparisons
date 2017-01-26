package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_30 {
    private final Production87_30 production = new Production87_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}