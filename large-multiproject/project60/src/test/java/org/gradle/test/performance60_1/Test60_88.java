package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_88 {
    private final Production60_88 production = new Production60_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}