package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_306 {
    private final Production87_306 production = new Production87_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}