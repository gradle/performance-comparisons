package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_281 {
    private final Production99_281 production = new Production99_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}