package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_259 {
    private final Production87_259 production = new Production87_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}