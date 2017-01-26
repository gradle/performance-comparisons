package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_253 {
    private final Production90_253 production = new Production90_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}