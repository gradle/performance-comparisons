package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_305 {
    private final Production87_305 production = new Production87_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}