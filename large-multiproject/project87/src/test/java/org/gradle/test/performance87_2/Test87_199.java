package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_199 {
    private final Production87_199 production = new Production87_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}