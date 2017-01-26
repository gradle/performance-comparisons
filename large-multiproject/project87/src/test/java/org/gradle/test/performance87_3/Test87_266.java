package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_266 {
    private final Production87_266 production = new Production87_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}