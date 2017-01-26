package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_291 {
    private final Production87_291 production = new Production87_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}