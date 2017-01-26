package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_260 {
    private final Production87_260 production = new Production87_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}