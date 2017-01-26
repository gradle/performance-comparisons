package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_498 {
    private final Production42_498 production = new Production42_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}