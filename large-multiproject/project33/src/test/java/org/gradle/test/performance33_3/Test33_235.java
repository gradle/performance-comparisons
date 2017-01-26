package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_235 {
    private final Production33_235 production = new Production33_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}