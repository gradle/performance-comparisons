package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_116 {
    private final Production33_116 production = new Production33_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}