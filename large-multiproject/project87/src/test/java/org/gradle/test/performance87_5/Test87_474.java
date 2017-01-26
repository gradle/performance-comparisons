package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_474 {
    private final Production87_474 production = new Production87_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}