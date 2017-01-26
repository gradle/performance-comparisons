package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_76 {
    private final Production20_76 production = new Production20_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}