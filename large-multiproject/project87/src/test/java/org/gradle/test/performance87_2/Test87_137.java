package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_137 {
    private final Production87_137 production = new Production87_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}