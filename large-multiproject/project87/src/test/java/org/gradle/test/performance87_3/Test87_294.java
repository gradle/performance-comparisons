package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_294 {
    private final Production87_294 production = new Production87_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}