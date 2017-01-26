package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_302 {
    private final Production33_302 production = new Production33_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}