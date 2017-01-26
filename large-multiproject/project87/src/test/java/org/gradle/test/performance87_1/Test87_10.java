package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_10 {
    private final Production87_10 production = new Production87_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}