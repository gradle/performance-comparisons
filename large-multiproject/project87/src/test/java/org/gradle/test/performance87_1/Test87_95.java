package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_95 {
    private final Production87_95 production = new Production87_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}