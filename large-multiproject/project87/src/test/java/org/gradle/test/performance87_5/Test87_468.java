package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_468 {
    private final Production87_468 production = new Production87_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}