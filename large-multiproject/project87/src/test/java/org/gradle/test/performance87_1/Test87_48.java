package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_48 {
    private final Production87_48 production = new Production87_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}