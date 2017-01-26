package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_283 {
    private final Production33_283 production = new Production33_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}