package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_373 {
    private final Production87_373 production = new Production87_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}