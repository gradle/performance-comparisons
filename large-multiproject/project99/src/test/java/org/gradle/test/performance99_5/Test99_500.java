package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_500 {
    private final Production99_500 production = new Production99_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}