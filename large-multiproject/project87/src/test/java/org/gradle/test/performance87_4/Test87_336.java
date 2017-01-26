package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_336 {
    private final Production87_336 production = new Production87_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}