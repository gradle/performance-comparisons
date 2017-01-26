package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_307 {
    private final Production87_307 production = new Production87_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}