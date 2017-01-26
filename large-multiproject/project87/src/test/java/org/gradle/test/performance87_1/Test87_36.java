package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_36 {
    private final Production87_36 production = new Production87_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}