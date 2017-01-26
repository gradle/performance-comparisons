package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_357 {
    private final Production33_357 production = new Production33_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}