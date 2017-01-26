package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_457 {
    private final Production87_457 production = new Production87_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}