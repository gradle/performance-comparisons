package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_145 {
    private final Production90_145 production = new Production90_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}