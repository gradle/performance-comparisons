package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_482 {
    private final Production87_482 production = new Production87_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}