package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_288 {
    private final Production94_288 production = new Production94_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}