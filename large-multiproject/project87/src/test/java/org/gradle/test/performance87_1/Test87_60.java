package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_60 {
    private final Production87_60 production = new Production87_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}