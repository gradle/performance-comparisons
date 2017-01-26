package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_106 {
    private final Production90_106 production = new Production90_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}