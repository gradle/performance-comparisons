package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_371 {
    private final Production33_371 production = new Production33_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}