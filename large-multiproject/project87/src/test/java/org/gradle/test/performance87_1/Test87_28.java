package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_28 {
    private final Production87_28 production = new Production87_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}