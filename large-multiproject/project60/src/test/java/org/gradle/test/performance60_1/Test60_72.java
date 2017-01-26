package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_72 {
    private final Production60_72 production = new Production60_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}