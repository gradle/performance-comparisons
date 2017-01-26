package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_65 {
    private final Production87_65 production = new Production87_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}