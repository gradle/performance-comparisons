package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_97 {
    private final Production20_97 production = new Production20_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}