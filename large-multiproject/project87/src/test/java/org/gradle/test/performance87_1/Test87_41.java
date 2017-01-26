package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_41 {
    private final Production87_41 production = new Production87_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}