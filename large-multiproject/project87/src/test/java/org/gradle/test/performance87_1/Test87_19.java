package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_19 {
    private final Production87_19 production = new Production87_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}