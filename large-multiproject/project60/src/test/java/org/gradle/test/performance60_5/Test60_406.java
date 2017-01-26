package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_406 {
    private final Production60_406 production = new Production60_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}