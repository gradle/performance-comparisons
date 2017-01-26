package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_477 {
    private final Production87_477 production = new Production87_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}