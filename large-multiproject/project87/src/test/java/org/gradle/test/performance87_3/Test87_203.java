package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_203 {
    private final Production87_203 production = new Production87_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}