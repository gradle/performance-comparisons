package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_89 {
    private final Production20_89 production = new Production20_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}