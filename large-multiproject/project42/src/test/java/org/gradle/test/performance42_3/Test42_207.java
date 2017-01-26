package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_207 {
    private final Production42_207 production = new Production42_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}