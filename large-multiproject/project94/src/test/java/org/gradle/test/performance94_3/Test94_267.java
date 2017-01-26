package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_267 {
    private final Production94_267 production = new Production94_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}