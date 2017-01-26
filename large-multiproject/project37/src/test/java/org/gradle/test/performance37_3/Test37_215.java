package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_215 {
    private final Production37_215 production = new Production37_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}