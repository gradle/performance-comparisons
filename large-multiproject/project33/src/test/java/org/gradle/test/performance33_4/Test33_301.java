package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_301 {
    private final Production33_301 production = new Production33_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}