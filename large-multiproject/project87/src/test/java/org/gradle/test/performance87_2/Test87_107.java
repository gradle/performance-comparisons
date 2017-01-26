package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_107 {
    private final Production87_107 production = new Production87_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}