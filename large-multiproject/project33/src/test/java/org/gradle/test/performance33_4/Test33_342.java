package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_342 {
    private final Production33_342 production = new Production33_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}