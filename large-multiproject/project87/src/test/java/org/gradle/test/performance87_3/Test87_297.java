package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_297 {
    private final Production87_297 production = new Production87_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}