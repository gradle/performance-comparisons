package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_92 {
    private final Production99_92 production = new Production99_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}