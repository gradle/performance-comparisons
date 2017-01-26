package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_152 {
    private final Production33_152 production = new Production33_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}