package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_317 {
    private final Production87_317 production = new Production87_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}