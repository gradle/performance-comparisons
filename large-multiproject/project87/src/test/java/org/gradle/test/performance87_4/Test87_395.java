package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_395 {
    private final Production87_395 production = new Production87_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}