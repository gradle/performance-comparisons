package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_243 {
    private final Production87_243 production = new Production87_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}