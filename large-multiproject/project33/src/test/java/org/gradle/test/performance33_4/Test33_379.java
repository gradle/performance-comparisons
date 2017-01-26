package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_379 {
    private final Production33_379 production = new Production33_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}