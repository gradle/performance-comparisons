package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_166 {
    private final Production10_166 production = new Production10_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}