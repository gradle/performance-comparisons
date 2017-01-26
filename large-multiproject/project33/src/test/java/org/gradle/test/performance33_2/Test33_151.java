package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_151 {
    private final Production33_151 production = new Production33_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}