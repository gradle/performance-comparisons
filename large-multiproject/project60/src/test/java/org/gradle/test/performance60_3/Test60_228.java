package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_228 {
    private final Production60_228 production = new Production60_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}