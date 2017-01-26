package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_373 {
    private final Production20_373 production = new Production20_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}