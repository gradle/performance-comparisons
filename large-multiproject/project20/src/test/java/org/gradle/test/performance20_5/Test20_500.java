package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_500 {
    private final Production20_500 production = new Production20_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}