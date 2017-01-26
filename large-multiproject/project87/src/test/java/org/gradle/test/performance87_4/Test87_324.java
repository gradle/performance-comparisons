package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_324 {
    private final Production87_324 production = new Production87_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}