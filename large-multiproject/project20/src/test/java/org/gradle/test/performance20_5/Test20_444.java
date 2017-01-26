package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_444 {
    private final Production20_444 production = new Production20_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}