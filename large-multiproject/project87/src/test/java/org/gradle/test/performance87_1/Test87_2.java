package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_2 {
    private final Production87_2 production = new Production87_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}