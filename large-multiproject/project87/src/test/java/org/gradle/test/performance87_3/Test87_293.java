package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_293 {
    private final Production87_293 production = new Production87_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}