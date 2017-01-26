package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_106 {
    private final Production87_106 production = new Production87_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}