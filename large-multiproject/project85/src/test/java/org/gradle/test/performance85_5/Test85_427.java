package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_427 {
    private final Production85_427 production = new Production85_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}