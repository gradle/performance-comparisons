package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_151 {
    private final Production85_151 production = new Production85_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}