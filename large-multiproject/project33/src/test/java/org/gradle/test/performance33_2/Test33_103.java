package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_103 {
    private final Production33_103 production = new Production33_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}