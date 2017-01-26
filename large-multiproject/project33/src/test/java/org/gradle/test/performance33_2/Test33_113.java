package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_113 {
    private final Production33_113 production = new Production33_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}