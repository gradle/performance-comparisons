package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_310 {
    private final Production87_310 production = new Production87_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}