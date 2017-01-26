package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_437 {
    private final Production87_437 production = new Production87_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}