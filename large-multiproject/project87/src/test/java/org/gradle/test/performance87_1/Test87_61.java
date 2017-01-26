package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_61 {
    private final Production87_61 production = new Production87_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}