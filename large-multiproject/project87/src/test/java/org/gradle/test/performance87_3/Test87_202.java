package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_202 {
    private final Production87_202 production = new Production87_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}