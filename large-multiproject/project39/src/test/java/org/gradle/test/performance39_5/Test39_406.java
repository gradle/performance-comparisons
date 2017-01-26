package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_406 {
    private final Production39_406 production = new Production39_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}