package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_142 {
    private final Production33_142 production = new Production33_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}