package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_105 {
    private final Production87_105 production = new Production87_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}