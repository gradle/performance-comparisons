package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_427 {
    private final Production9_427 production = new Production9_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}