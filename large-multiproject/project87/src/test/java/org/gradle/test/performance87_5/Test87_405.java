package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_405 {
    private final Production87_405 production = new Production87_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}