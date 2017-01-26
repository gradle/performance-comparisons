package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_175 {
    private final Production87_175 production = new Production87_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}