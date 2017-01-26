package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_303 {
    private final Production87_303 production = new Production87_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}