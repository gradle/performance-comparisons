package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_442 {
    private final Production20_442 production = new Production20_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}