package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_153 {
    private final Production52_153 production = new Production52_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}