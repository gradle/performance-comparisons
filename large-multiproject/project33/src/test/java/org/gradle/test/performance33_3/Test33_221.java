package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_221 {
    private final Production33_221 production = new Production33_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}