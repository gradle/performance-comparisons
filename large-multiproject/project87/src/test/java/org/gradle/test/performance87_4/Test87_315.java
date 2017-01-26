package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_315 {
    private final Production87_315 production = new Production87_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}