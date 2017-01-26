package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_187 {
    private final Production33_187 production = new Production33_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}