package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_220 {
    private final Production87_220 production = new Production87_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}