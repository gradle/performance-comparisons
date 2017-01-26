package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_418 {
    private final Production87_418 production = new Production87_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}