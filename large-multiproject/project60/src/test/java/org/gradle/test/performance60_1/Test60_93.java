package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_93 {
    private final Production60_93 production = new Production60_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}