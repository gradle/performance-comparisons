package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_228 {
    private final Production90_228 production = new Production90_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}