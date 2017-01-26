package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_140 {
    private final Production33_140 production = new Production33_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}