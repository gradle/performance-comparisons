package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_66 {
    private final Production87_66 production = new Production87_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}