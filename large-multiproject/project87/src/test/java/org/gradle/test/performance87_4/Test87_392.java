package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_392 {
    private final Production87_392 production = new Production87_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}