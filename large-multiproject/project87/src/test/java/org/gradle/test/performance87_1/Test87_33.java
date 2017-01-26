package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_33 {
    private final Production87_33 production = new Production87_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}