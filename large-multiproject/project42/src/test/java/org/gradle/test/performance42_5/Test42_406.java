package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_406 {
    private final Production42_406 production = new Production42_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}