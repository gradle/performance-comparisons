package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_246 {
    private final Production87_246 production = new Production87_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}