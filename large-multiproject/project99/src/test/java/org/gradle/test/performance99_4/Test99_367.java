package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_367 {
    private final Production99_367 production = new Production99_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}