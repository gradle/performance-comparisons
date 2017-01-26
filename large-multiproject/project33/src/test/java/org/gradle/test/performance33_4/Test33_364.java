package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_364 {
    private final Production33_364 production = new Production33_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}