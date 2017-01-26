package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_25 {
    private final Production87_25 production = new Production87_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}