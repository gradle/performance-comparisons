package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_286 {
    private final Production87_286 production = new Production87_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}