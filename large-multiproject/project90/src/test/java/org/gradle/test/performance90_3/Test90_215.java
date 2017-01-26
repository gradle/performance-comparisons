package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_215 {
    private final Production90_215 production = new Production90_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}