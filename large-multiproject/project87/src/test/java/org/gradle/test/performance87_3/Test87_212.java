package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_212 {
    private final Production87_212 production = new Production87_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}