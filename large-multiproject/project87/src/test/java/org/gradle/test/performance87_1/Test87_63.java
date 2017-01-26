package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_63 {
    private final Production87_63 production = new Production87_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}