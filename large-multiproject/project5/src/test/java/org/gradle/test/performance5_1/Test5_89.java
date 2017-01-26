package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_89 {
    private final Production5_89 production = new Production5_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}