package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_23 {
    private final Production33_23 production = new Production33_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}