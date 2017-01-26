package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_364 {
    private final Production87_364 production = new Production87_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}