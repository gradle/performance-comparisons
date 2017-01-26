package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_470 {
    private final Production33_470 production = new Production33_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}