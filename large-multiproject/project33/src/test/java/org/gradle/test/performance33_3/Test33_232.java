package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_232 {
    private final Production33_232 production = new Production33_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}