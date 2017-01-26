package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_172 {
    private final Production42_172 production = new Production42_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}