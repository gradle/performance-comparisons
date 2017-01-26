package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_14 {
    private final Production87_14 production = new Production87_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}