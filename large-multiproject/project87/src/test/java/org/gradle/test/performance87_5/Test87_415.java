package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_415 {
    private final Production87_415 production = new Production87_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}