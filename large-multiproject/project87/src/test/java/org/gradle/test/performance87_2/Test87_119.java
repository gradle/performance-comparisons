package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_119 {
    private final Production87_119 production = new Production87_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}