package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_98 {
    private final Production60_98 production = new Production60_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}