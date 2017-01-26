package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_172 {
    private final Production87_172 production = new Production87_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}