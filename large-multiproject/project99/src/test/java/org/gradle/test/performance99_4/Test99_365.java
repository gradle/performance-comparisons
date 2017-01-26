package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_365 {
    private final Production99_365 production = new Production99_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}