package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_407 {
    private final Production87_407 production = new Production87_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}