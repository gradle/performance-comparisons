package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_265 {
    private final Production33_265 production = new Production33_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}