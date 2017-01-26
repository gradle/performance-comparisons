package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_319 {
    private final Production52_319 production = new Production52_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}