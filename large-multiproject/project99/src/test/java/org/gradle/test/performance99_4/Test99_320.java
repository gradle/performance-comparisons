package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_320 {
    private final Production99_320 production = new Production99_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}