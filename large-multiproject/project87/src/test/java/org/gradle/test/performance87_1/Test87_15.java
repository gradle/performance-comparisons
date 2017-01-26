package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_15 {
    private final Production87_15 production = new Production87_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}