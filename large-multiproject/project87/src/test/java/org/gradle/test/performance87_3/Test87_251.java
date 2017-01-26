package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_251 {
    private final Production87_251 production = new Production87_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}