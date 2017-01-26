package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_163 {
    private final Production99_163 production = new Production99_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}