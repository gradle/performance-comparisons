package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_330 {
    private final Production20_330 production = new Production20_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}