package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_208 {
    private final Production33_208 production = new Production33_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}