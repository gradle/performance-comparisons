package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_179 {
    private final Production33_179 production = new Production33_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}