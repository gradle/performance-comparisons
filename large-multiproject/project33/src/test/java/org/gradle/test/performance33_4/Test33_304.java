package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_304 {
    private final Production33_304 production = new Production33_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}