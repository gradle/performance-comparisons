package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_341 {
    private final Production87_341 production = new Production87_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}