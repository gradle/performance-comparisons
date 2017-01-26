package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_10 {
    private final Production99_10 production = new Production99_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}