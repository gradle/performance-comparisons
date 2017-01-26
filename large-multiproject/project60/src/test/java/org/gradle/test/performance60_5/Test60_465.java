package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_465 {
    private final Production60_465 production = new Production60_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}