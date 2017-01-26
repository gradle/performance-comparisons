package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_322 {
    private final Production87_322 production = new Production87_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}