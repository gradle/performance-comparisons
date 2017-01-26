package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_380 {
    private final Production87_380 production = new Production87_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}