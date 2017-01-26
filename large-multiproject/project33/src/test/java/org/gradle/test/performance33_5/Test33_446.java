package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_446 {
    private final Production33_446 production = new Production33_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}