package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_137 {
    private final Production33_137 production = new Production33_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}