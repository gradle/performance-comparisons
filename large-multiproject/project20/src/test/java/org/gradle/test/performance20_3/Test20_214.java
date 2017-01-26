package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_214 {
    private final Production20_214 production = new Production20_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}