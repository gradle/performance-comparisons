package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_350 {
    private final Production87_350 production = new Production87_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}