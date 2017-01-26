package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_271 {
    private final Production33_271 production = new Production33_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}