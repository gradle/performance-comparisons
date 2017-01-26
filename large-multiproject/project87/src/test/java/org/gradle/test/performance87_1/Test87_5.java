package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_5 {
    private final Production87_5 production = new Production87_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}