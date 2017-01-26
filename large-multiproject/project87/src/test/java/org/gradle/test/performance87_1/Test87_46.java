package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_46 {
    private final Production87_46 production = new Production87_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}