package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_495 {
    private final Production60_495 production = new Production60_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}