package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_77 {
    private final Production42_77 production = new Production42_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}