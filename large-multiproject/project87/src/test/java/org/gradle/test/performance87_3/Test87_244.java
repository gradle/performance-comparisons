package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_244 {
    private final Production87_244 production = new Production87_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}