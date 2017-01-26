package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_44 {
    private final Production94_44 production = new Production94_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}