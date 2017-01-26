package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_163 {
    private final Production87_163 production = new Production87_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}