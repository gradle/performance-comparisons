package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_427 {
    private final Production29_427 production = new Production29_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}