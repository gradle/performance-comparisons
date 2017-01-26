package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_75 {
    private final Production87_75 production = new Production87_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}