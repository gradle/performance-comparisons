package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_91 {
    private final Production87_91 production = new Production87_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}