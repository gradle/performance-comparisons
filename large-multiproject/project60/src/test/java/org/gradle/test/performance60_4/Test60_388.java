package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_388 {
    private final Production60_388 production = new Production60_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}