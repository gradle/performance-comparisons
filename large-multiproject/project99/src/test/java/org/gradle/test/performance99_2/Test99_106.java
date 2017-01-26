package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_106 {
    private final Production99_106 production = new Production99_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}