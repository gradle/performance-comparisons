package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_465 {
    private final Production87_465 production = new Production87_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}