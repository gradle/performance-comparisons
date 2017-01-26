package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_337 {
    private final Production99_337 production = new Production99_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}