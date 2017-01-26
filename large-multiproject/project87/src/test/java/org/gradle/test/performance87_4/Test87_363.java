package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_363 {
    private final Production87_363 production = new Production87_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}