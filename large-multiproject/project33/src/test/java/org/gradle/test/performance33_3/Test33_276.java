package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_276 {
    private final Production33_276 production = new Production33_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}