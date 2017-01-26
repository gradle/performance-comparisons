package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_162 {
    private final Production87_162 production = new Production87_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}