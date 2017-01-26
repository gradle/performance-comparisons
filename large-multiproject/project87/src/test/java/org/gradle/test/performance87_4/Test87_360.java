package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_360 {
    private final Production87_360 production = new Production87_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}