package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_253 {
    private final Production87_253 production = new Production87_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}