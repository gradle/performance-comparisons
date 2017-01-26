package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_258 {
    private final Production87_258 production = new Production87_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}