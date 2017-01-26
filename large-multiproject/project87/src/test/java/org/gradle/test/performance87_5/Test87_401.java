package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_401 {
    private final Production87_401 production = new Production87_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}