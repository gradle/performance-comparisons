package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_259 {
    private final Production99_259 production = new Production99_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}