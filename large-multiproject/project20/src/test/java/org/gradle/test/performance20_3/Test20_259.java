package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_259 {
    private final Production20_259 production = new Production20_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}