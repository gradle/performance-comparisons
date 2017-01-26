package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_56 {
    private final Production87_56 production = new Production87_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}