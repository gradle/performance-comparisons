package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_135 {
    private final Production33_135 production = new Production33_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}