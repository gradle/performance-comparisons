package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_358 {
    private final Production99_358 production = new Production99_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}