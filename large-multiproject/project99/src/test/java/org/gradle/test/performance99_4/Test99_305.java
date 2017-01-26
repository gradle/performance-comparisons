package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_305 {
    private final Production99_305 production = new Production99_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}