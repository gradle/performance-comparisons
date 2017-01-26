package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_371 {
    private final Production87_371 production = new Production87_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}