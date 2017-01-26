package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_427 {
    private final Production60_427 production = new Production60_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}