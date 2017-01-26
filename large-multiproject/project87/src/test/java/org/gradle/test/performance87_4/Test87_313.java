package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_313 {
    private final Production87_313 production = new Production87_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}