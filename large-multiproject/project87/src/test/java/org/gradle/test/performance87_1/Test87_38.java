package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_38 {
    private final Production87_38 production = new Production87_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}