package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_138 {
    private final Production99_138 production = new Production99_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}