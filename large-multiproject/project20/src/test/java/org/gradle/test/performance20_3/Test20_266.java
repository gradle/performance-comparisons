package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_266 {
    private final Production20_266 production = new Production20_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}