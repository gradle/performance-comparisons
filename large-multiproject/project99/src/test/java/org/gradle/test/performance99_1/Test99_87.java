package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_87 {
    private final Production99_87 production = new Production99_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}