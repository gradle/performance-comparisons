package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_6 {
    private final Production87_6 production = new Production87_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}