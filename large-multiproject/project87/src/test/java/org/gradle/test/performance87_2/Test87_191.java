package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_191 {
    private final Production87_191 production = new Production87_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}