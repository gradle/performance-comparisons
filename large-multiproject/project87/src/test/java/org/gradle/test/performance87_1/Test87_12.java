package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_12 {
    private final Production87_12 production = new Production87_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}