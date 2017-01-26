package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_42 {
    private final Production87_42 production = new Production87_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}