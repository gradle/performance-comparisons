package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_425 {
    private final Production42_425 production = new Production42_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}