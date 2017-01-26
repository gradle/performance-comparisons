package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_121 {
    private final Production33_121 production = new Production33_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}