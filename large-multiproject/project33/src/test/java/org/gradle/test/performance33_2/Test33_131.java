package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_131 {
    private final Production33_131 production = new Production33_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}