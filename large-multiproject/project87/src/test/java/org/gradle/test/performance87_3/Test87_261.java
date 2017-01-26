package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_261 {
    private final Production87_261 production = new Production87_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}