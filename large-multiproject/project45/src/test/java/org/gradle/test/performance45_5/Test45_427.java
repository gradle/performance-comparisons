package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_427 {
    private final Production45_427 production = new Production45_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}