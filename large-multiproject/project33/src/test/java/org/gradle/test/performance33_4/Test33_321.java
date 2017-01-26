package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_321 {
    private final Production33_321 production = new Production33_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}