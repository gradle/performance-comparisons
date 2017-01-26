package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_100 {
    private final Production94_100 production = new Production94_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}