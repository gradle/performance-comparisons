package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_89 {
    private final Production87_89 production = new Production87_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}