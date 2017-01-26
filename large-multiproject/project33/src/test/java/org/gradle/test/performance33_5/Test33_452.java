package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_452 {
    private final Production33_452 production = new Production33_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}