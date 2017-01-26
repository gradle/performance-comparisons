package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_67 {
    private final Production87_67 production = new Production87_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}