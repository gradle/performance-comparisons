package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_166 {
    private final Production37_166 production = new Production37_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}