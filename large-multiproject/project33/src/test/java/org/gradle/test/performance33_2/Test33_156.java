package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_156 {
    private final Production33_156 production = new Production33_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}