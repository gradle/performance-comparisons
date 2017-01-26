package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_254 {
    private final Production33_254 production = new Production33_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}