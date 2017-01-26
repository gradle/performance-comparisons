package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_195 {
    private final Production99_195 production = new Production99_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}