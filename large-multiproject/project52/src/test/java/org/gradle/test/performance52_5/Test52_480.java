package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_480 {
    private final Production52_480 production = new Production52_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}