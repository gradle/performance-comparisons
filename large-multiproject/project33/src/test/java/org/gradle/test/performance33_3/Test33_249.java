package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_249 {
    private final Production33_249 production = new Production33_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}