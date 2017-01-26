package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_381 {
    private final Production33_381 production = new Production33_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}