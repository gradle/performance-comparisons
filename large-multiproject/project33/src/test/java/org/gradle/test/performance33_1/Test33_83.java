package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_83 {
    private final Production33_83 production = new Production33_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}