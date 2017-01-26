package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_390 {
    private final Production87_390 production = new Production87_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}