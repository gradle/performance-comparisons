package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_88 {
    private final Production87_88 production = new Production87_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}