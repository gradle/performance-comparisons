package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_155 {
    private final Production87_155 production = new Production87_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}