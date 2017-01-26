package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_323 {
    private final Production87_323 production = new Production87_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}