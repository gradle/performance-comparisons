package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_183 {
    private final Production90_183 production = new Production90_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}