package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_417 {
    private final Production10_417 production = new Production10_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}