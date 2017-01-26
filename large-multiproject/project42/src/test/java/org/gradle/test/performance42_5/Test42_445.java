package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_445 {
    private final Production42_445 production = new Production42_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}