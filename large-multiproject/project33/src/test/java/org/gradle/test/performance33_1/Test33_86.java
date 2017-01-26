package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_86 {
    private final Production33_86 production = new Production33_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}