package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_31 {
    private final Production87_31 production = new Production87_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}