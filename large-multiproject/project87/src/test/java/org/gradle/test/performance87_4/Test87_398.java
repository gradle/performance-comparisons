package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_398 {
    private final Production87_398 production = new Production87_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}