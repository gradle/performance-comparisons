package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_147 {
    private final Production90_147 production = new Production90_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}