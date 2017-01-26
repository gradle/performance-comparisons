package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_377 {
    private final Production87_377 production = new Production87_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}