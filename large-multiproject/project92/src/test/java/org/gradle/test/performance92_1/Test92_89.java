package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_89 {
    private final Production92_89 production = new Production92_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}