package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_268 {
    private final Production87_268 production = new Production87_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}