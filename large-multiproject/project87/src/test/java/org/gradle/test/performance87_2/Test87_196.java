package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_196 {
    private final Production87_196 production = new Production87_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}