package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_126 {
    private final Production90_126 production = new Production90_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}