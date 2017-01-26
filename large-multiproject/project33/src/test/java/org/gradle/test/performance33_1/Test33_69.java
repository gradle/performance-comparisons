package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_69 {
    private final Production33_69 production = new Production33_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}