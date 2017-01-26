package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_60 {
    private final Production33_60 production = new Production33_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}