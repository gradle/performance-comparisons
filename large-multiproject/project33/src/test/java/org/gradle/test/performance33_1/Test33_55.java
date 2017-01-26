package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_55 {
    private final Production33_55 production = new Production33_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}