package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_195 {
    private final Production90_195 production = new Production90_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}