package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_200 {
    private final Production87_200 production = new Production87_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}