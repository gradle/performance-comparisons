package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_266 {
    private final Production90_266 production = new Production90_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}