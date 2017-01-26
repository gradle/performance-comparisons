package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_51 {
    private final Production87_51 production = new Production87_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}