package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_168 {
    private final Production87_168 production = new Production87_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}