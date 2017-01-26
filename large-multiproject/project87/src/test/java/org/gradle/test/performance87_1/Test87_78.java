package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_78 {
    private final Production87_78 production = new Production87_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}