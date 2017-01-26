package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_435 {
    private final Production87_435 production = new Production87_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}