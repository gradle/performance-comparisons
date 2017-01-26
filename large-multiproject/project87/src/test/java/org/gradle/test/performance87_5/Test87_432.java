package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_432 {
    private final Production87_432 production = new Production87_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}