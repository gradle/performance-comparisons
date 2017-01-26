package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_7 {
    private final Production87_7 production = new Production87_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}