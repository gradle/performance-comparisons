package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_495 {
    private final Production42_495 production = new Production42_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}