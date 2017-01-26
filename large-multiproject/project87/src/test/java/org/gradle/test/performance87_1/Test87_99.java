package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_99 {
    private final Production87_99 production = new Production87_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}