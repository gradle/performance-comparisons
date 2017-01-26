package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_71 {
    private final Production90_71 production = new Production90_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}