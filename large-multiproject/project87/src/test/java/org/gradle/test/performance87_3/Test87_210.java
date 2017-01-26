package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_210 {
    private final Production87_210 production = new Production87_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}