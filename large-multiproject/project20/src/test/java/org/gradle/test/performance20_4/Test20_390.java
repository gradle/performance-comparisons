package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_390 {
    private final Production20_390 production = new Production20_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}