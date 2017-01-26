package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_3 {
    private final Production87_3 production = new Production87_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}