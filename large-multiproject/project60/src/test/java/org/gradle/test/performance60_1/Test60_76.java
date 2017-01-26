package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_76 {
    private final Production60_76 production = new Production60_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}