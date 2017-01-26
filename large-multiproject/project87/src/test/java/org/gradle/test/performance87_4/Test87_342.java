package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_342 {
    private final Production87_342 production = new Production87_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}