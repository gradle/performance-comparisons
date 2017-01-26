package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_427 {
    private final Production94_427 production = new Production94_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}