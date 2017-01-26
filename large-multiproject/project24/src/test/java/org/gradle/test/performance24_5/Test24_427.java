package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_427 {
    private final Production24_427 production = new Production24_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}