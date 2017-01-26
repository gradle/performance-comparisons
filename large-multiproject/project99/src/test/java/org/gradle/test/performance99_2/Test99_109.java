package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_109 {
    private final Production99_109 production = new Production99_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}