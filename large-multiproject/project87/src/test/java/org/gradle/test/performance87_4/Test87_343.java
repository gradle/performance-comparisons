package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_343 {
    private final Production87_343 production = new Production87_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}