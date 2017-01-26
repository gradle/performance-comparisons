package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_88 {
    private final Production42_88 production = new Production42_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}