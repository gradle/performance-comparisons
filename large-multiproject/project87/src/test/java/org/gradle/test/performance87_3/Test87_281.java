package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_281 {
    private final Production87_281 production = new Production87_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}