package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_138 {
    private final Production87_138 production = new Production87_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}