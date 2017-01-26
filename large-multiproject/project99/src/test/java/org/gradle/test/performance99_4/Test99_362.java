package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_362 {
    private final Production99_362 production = new Production99_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}