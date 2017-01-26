package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_38 {
    private final Production60_38 production = new Production60_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}