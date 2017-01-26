package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_92 {
    private final Production87_92 production = new Production87_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}