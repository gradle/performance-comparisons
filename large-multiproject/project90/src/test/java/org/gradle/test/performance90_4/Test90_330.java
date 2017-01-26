package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_330 {
    private final Production90_330 production = new Production90_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}