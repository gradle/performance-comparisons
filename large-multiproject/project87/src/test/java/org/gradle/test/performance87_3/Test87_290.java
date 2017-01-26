package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_290 {
    private final Production87_290 production = new Production87_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}