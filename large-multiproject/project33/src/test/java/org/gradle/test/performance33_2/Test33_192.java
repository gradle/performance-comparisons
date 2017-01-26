package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_192 {
    private final Production33_192 production = new Production33_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}