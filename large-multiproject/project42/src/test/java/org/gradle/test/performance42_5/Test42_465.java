package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_465 {
    private final Production42_465 production = new Production42_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}