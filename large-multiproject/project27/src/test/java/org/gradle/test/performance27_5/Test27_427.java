package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_427 {
    private final Production27_427 production = new Production27_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}