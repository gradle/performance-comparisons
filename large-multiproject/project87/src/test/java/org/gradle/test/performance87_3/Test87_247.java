package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_247 {
    private final Production87_247 production = new Production87_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}