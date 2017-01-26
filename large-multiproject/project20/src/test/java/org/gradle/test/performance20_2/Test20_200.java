package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_200 {
    private final Production20_200 production = new Production20_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}