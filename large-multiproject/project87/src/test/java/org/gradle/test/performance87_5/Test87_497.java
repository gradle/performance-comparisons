package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_497 {
    private final Production87_497 production = new Production87_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}