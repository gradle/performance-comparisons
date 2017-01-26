package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_357 {
    private final Production87_357 production = new Production87_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}