package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_9 {
    private final Production87_9 production = new Production87_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}