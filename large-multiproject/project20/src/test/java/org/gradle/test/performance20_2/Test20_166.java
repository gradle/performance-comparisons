package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_166 {
    private final Production20_166 production = new Production20_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}