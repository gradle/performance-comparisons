package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_68 {
    private final Production20_68 production = new Production20_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}