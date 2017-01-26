package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_406 {
    private final Production79_406 production = new Production79_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}