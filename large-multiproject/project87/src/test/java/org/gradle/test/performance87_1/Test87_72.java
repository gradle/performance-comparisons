package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_72 {
    private final Production87_72 production = new Production87_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}