package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_488 {
    private final Production87_488 production = new Production87_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}