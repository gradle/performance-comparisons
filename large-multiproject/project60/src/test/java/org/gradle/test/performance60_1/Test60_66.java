package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_66 {
    private final Production60_66 production = new Production60_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}