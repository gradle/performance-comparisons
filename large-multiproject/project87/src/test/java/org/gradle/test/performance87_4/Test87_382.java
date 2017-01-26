package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_382 {
    private final Production87_382 production = new Production87_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}