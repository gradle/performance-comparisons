package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_44 {
    private final Production60_44 production = new Production60_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}