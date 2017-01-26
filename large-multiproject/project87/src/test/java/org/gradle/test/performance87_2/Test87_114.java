package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_114 {
    private final Production87_114 production = new Production87_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}