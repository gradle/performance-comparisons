package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_200 {
    private final Production99_200 production = new Production99_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}