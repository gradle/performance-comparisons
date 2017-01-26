package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_427 {
    private final Production52_427 production = new Production52_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}