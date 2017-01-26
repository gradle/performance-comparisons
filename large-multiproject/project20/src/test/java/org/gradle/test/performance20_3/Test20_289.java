package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_289 {
    private final Production20_289 production = new Production20_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}