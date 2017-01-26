package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_134 {
    private final Production87_134 production = new Production87_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}