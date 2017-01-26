package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_30 {
    private final Production33_30 production = new Production33_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}