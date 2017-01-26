package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_226 {
    private final Production33_226 production = new Production33_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}