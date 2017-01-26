package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_427 {
    private final Production73_427 production = new Production73_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}