package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_168 {
    private final Production60_168 production = new Production60_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}