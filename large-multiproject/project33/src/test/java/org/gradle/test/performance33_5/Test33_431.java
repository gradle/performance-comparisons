package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_431 {
    private final Production33_431 production = new Production33_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}