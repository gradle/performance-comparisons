package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_334 {
    private final Production87_334 production = new Production87_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}