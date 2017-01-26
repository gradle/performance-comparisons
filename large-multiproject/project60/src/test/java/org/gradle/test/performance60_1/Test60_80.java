package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_80 {
    private final Production60_80 production = new Production60_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}