package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_8 {
    private final Production87_8 production = new Production87_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}