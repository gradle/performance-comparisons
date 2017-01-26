package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_400 {
    private final Production33_400 production = new Production33_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}