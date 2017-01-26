package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_119 {
    private final Production90_119 production = new Production90_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}