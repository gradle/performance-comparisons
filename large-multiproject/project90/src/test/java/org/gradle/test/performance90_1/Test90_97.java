package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_97 {
    private final Production90_97 production = new Production90_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}