package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_80 {
    private final Production87_80 production = new Production87_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}