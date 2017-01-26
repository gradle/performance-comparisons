package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_421 {
    private final Production87_421 production = new Production87_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}