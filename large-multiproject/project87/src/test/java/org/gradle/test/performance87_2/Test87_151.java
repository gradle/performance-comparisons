package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_151 {
    private final Production87_151 production = new Production87_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}