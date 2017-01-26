package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_427 {
    private final Production95_427 production = new Production95_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}