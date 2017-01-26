package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_68 {
    private final Production87_68 production = new Production87_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}