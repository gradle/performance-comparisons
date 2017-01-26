package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_15 {
    private final Production33_15 production = new Production33_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}