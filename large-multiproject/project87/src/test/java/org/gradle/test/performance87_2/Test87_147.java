package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_147 {
    private final Production87_147 production = new Production87_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}