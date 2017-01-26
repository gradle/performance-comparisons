package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_40 {
    private final Production60_40 production = new Production60_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}