package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_195 {
    private final Production60_195 production = new Production60_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}