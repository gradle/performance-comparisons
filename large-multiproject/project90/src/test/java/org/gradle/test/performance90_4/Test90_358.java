package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_358 {
    private final Production90_358 production = new Production90_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}