package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_60 {
    private final Production99_60 production = new Production99_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}