package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_331 {
    private final Production42_331 production = new Production42_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}