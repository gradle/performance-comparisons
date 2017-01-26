package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_360 {
    private final Production33_360 production = new Production33_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}