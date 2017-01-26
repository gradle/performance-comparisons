package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_62 {
    private final Production20_62 production = new Production20_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}