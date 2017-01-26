package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_432 {
    private final Production20_432 production = new Production20_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}