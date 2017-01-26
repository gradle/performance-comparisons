package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_126 {
    private final Production87_126 production = new Production87_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}