package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_310 {
    private final Production99_310 production = new Production99_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}