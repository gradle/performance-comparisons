package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_89 {
    private final Production37_89 production = new Production37_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}