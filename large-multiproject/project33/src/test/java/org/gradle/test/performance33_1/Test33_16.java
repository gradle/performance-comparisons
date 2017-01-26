package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_16 {
    private final Production33_16 production = new Production33_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}