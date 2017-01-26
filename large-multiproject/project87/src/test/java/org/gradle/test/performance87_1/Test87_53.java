package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_53 {
    private final Production87_53 production = new Production87_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}