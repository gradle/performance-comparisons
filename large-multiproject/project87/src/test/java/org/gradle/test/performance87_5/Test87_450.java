package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_450 {
    private final Production87_450 production = new Production87_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}