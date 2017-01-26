package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_231 {
    private final Production87_231 production = new Production87_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}