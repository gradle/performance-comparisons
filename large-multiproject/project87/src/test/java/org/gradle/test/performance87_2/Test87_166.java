package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_166 {
    private final Production87_166 production = new Production87_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}