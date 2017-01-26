package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_228 {
    private final Production20_228 production = new Production20_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}