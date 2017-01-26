package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_238 {
    private final Production87_238 production = new Production87_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}