package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_361 {
    private final Production99_361 production = new Production99_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}