package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_93 {
    private final Production20_93 production = new Production20_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}