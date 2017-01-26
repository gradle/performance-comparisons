package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_221 {
    private final Production87_221 production = new Production87_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}