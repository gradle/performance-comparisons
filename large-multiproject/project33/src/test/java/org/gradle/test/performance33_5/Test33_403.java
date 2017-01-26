package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_403 {
    private final Production33_403 production = new Production33_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}