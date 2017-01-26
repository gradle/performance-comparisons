package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_230 {
    private final Production87_230 production = new Production87_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}