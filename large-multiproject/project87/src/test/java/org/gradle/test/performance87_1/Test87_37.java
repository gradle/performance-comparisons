package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_37 {
    private final Production87_37 production = new Production87_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}