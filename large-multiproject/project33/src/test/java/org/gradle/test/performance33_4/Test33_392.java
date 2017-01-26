package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_392 {
    private final Production33_392 production = new Production33_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}