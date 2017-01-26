package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_35 {
    private final Production87_35 production = new Production87_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}