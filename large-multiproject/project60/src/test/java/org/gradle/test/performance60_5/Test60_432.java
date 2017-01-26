package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_432 {
    private final Production60_432 production = new Production60_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}