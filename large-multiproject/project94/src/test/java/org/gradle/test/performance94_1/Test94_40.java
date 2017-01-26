package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_40 {
    private final Production94_40 production = new Production94_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}