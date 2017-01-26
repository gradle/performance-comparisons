package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_216 {
    private final Production87_216 production = new Production87_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}