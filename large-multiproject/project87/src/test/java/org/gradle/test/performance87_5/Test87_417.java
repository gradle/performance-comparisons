package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_417 {
    private final Production87_417 production = new Production87_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}