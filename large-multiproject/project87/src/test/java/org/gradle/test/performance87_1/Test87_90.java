package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_90 {
    private final Production87_90 production = new Production87_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}