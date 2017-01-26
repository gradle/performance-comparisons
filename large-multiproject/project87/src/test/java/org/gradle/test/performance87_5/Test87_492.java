package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_492 {
    private final Production87_492 production = new Production87_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}