package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_119 {
    private final Production60_119 production = new Production60_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}