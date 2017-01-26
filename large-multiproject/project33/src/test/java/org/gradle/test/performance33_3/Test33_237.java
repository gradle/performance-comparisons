package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_237 {
    private final Production33_237 production = new Production33_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}