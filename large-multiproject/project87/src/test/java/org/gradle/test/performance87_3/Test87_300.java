package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_300 {
    private final Production87_300 production = new Production87_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}